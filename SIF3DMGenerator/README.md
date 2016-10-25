# License
> Copyright 2013 - 2016 Systemic Pty Ltd
> 
> Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
> 
> [http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0 "Apache License, Version 2.0")
> 
> Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

# Summary
The SIF3 Data Model Generator is a Java Project to generate and build SIF3 Data Models for various 
locales (AU, NA, UK etc). The Data models are build using XJC (JAXB Based POJO Generator) and XSDs. 
The POJOs that are generated are JAXB annotated java classes.
The main purpose of this project is to generate the SIF Locale specific Data Model classes that can
be used with the SIF3 Framework (https://github.com/nsip/sif3-framework-java). In fact the provided
marshaller and unmarshaller classes in the sif3DMGenerator/src source directories ('conversion' package)
are based on the SIF3 Framework marshaller and unmarshaller interfaces.

The reason for this project is that the actual SIF3 Framework becomes/remains independent of a locale's
data model. It is expected that a specific SIF3 Project will include not only the SIF3 Framework 
Libraries but also one of the Data Model libraries generated out of this project.

As of September 01, 2016 the following SIF Locale Data Models are supported by this project
- SIF AU 1.3 for Infrastructure 3.x
- SIF AU 1.4 for Infrastructure 3.x
- SIF AU 3.4 (Draft) for Infrastructure 3.x
- SIF NA (North America) 3.2
- SIF NA (North America) 3.3

# Build Instructions using build.xml

## SIF AU:
1. Run the 20-generateAU13for30 (SIF AU 1.3 data model), 21-generateAU14for30 (SIF AU 1.4 data model)
   or 22-generateAU34 (SIF AU 3.4 data model) ant target respectively.
   This will generate the Java POJOs for the chosen data model. The POJOs can be found in the
   Generator/data/output/sifau1.3, Generator/data/output/sifau1.4 or Generator/data/output/sifau3.4 respectively.
2. Remove all java classes in the sif3Datamodel/src/sif/dd/au30/model source directory.
3. Copy the generated POJOs from step 1) to the directory of step 2).
4. Run the 10-jar-dd-au13for30 (SIF AU 1.3 data model), 11-jar-dd-au14for30 (SIF AU 1.4 data model) or 
   12-jar-dd-au34 (SIF AU 3.4 data model) ant target respectively.
   This will build a jar file into the build/dist directory. This jar file can now be used in your
   SIF3 Project.
  
## SIF US:
1. Run the 30-generateUS32 or 31-generateUS33 ant target.
   This will generate the Java POJOs for the chosen data model. The POJOs can be found in the
   Generator/data/output/sifus32 or Generator/data/output/sifus33.
2. Remove all java classes in the sif3Datamodel/src/sif/dd/us32/model or sif3Datamodel/src/sif/dd/us33/model source directory.
3. Copy the generated POJOs from step 1) to the directory of step 2).
4. Run the 15-jar-dd-us32 or 16-jar-dd-us33 ant target.
   This will build a jar file into the build/dist directory. This jar file can now be used in your
   SIF3 Project.

# Version History and Update

## Version from September 23, 2014
Initial submission.

## Version from October 16, 2014
Added JSON mapping functionality to Marshaller and Unmarshaller classes.

## Version from March 03, 2015
Updated Marshallers and Unmarshallers to match the interface version of the SIF3 Framework.

## Version from September 03, 2015
- Added XSD for SIF AU 1.4/3.0.
- Modified build.xml to be more flexible with the SIF AU Datamodel generation and jar file build.

## Version from September 01, 2016
- Modifed this README.md file to accurately reflect available data models within this project.

## Version from October 23, 2016
- Added SIF AU 3.4 XSD (data/input/XSD/sifau30/au3.4 directory) and generated data model classes 
  for SIF AU 3.4 (sif.dd.au30 package). This represents the officially released SIF AU 3.4 Data Model.

# Download Instructions
How to download this project:

## Option 1 - As a Zip.
Click on the button marked "ZIP" available from the Code tab.

## Option 2 - Using a Git client.
From the command-line type: git clone git://github.com/nsip/SIF3DMGenerator-Java.git

Note that if you want to use this option but don't have the client installed, it can be 
downloaded from http://git-scm.com/download.


