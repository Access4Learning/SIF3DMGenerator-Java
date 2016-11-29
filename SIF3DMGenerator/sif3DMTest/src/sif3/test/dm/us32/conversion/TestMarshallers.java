/*
 * TestMarshallers.java
 * Created: 23/09/2014
 *
 * Copyright 2014 Systemic Pty Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License 
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package sif3.test.dm.us32.conversion;

import sif.dd.us32.conversion.DataModelMarshalFactory;
import sif.dd.us32.conversion.DataModelUnmarshalFactory;
import sif.dd.us32.model.K12StudentType;
import au.com.systemic.framework.utils.FileReaderWriter;
import au.com.systemic.framework.utils.Timer;

/**
 * @author Joerg Huber
 *
 */
public class TestMarshallers
{
    private final static String BASE_DIR = "C:/Development/GitHubRepositories/SIF3DMGenerator/SIF3DMGenerator";
//  private final static String BASE_DIR = "C:/Development/marsWorkspace/SIF3DMGenerator";

    private final static String INPUT_FILE_NAME  = BASE_DIR + "/sif3DMTest/testdata/us/input/NA32/k12Student.xml";
//	private final static String INPUT_FILE_NAME  = BASE_DIR + "/sif3DMTest/testdata/us/input/NA32/k12Students.xml";
//	private final static String INPUT_FILE_NAME  = BASE_DIR + "/sif3DMTest/testdata/us/input/NA32/k12Schools.xml";
//	private final static String INPUT_FILE_NAME  = BASE_DIR + "/sif3DMTest/testdata/us/input/NA32/k12Student.xml";

	private final static String OUTPUT_FILE_NAME_XML  = BASE_DIR + "/sif3DMTest/testdata/us/output/NA32/student.xml";
//	private final static String OUTPUT_FILE_NAME_XML  = BASE_DIR + "/sif3DMTest/testdata/us/output/NA32/students.xml";
//	private final static String OUTPUT_FILE_NAME_XML  = BASE_DIR + "/sif3DMTest/testdata/us/output/NA32/schools.xml";
//	private final static String OUTPUT_FILE_NAME_XML  = BASE_DIR + "/sif3DMTest/testdata/us/output/NA32/student.xml";

	private final static String OUTPUT_FILE_NAME_JSON  = BASE_DIR + "/sif3DMTest/sif3DMTest/testdata/us/output/NA32/student.json";
//  private final static String OUTPUT_FILE_NAME_JSON  = BASE_DIR + "/sif3DMTest/testdata/us/output/NA32/students.json";
//	private final static String OUTPUT_FILE_NAME_JSON  = BASE_DIR + "/sif3DMTest/testdata/us/output/NA32/schools.json";
//  private final static String OUTPUT_FILE_NAME_JSON  = BASE_DIR + "/sif3DMTest/testdata/us/output/NA32/student.json";

	private DataModelUnmarshalFactory unmarshaller = new DataModelUnmarshalFactory();
	private DataModelMarshalFactory marshaller = new DataModelMarshalFactory();


	private void testPerformance()
	{
		try
		{
			String inputEnvXML = FileReaderWriter.getFileContent(INPUT_FILE_NAME);
			Timer timer = new Timer();
			timer.start();
			K12StudentType data = (K12StudentType)unmarshaller.unmarshalFromXML(inputEnvXML, K12StudentType.class);
//			K12StudentCollectionType data = (K12StudentCollectionType)unmarshaller.unmarshalFromXML(inputEnvXML, K12StudentCollectionType.class);
//			K12SchoolCollectionType data = (K12SchoolCollectionType)unmarshaller.unmarshalFromXML(inputEnvXML, K12SchoolCollectionType.class);
			timer.finish();
			System.out.println("Time Taken to unmarshal: "+timer.timeTaken()+"ms");
			
			timer.start();
			String outputXML = marshaller.marshalToXML(data);
			timer.finish();
			FileReaderWriter.writeContentToFile(outputXML, OUTPUT_FILE_NAME_XML);
			System.out.println("Time Taken to marshal: "+timer.timeTaken()+"ms");
			
      timer.start();
      String outputJSON = marshaller.marshalToJSON(data);
      timer.finish();
      FileReaderWriter.writeContentToFile(outputJSON, OUTPUT_FILE_NAME_JSON);
      System.out.println("Time Taken to marshal: "+timer.timeTaken()+"ms");
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{

		TestMarshallers tester = new TestMarshallers();
		System.out.println("Start Testing TestMarshallers...");
		try
		{
			tester.testPerformance();
//			tester.testPerformance();
//			tester.testPerformance();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.println("End Testing TestMarshallers.");
	}
}
