# License
> Copyright 2013 - 2020 Systemic Pty Ltd
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
be used with the SIF3 Framework (https://github.com/Access4Learning/sif3-framework-java). In fact the provided
marshaller and unmarshaller classes in the sif3DMGenerator/src source directories ('conversion' package)
are based on the SIF3 Framework marshaller and unmarshaller interfaces.

The reason for this project is that the actual SIF3 Framework becomes/remains independent of a locale's
data model. It is expected that a specific SIF3 Project will include not only the SIF3 Framework 
Libraries but also one of the Data Model libraries generated out of this project.

As of April 13, 2021 the following SIF Locale Data Models are supported by this project
- SIF AU 1.3 for Infrastructure 3.x (Should not be used)
- SIF AU 1.4 for Infrastructure 3.x (Should not be used)
- SIF AU 3.4 for Infrastructure 3.x
- SIF AU 3.4.1 for Infrastructure 3.x
- SIF AU 3.4.2 for Infrastructure 3.x
- SIF AU 3.4.3 for Infrastructure 3.x
- SIF AU 3.4.4 for Infrastructure 3.x
- SIF AU 3.4.5 for Infrastructure 3.x
- SIF AU 3.4.6 for Infrastructure 3.x
- SIF AU 3.4.7 for Infrastructure 3.x
- SIF AU 3.4.8 for Infrastructure 3.x
- SIF NA (North America) 3.2
- SIF NA (North America) 3.3
- SIF NA Unity 4.0

## Usage with SIF3 Framework
Since version **0.15.0 of the SIF3 Framework** the **SIF Infrastructure 3.3** (or later) is supported. In the 3.3 infrastructure a new JSON format was introduced called PESC-JSON. This format is in addition to the JSON that has been supported in the past, which was known under the term JSON-Goessner or Goessner notation. There were 'breaking' changes required in the SIF3 Framework to enable this second JSON format. This in term meant that the sif3.3Common-0.15.0.jar, that is being used with this project, is no longer compatible with previous versions of the same library (e.g. sif3.2.1Common-0.14.1.jar). There were changes in all Marshaller and Unmarshaller classes in this project required that would break existing implementations with SIF 3.2.1 infrastructure projects. To enable continued support for implementations that use the SIF 3.2.1 infrastructure and therefore use the SIF3 Framework before version 0.15.0 the SIF3 Generator project required branching. If you need to produce updated data models for your locale you need to consider which SIF3 Framework version you are using and then use/download the correct branch of the SIF3 Generator to produce your data model artifacts that will be compatible with your SIF3 Framework version. Below is the list of appropriate SIF3 Generator branches to use with the corresponding SIF3 Framework version and therefore SIF 3.x Infrastructure version.

| SIF3DMGenerator Branch | SIF3Framework Version | SIF3 Infra Version  |
| ---------------------- | --------------------- | ------------------- |
| pre-fw15               | 0.14.1 or before      |  3.2.1 or before    |
| fw15-plus              | 0.15.0 or later       |  3.3 or later*      |
| master                 | 0.15.0 or later       |  3.3 or later*      |
*see update notes for Feb 10, 2021. 


**Note:** 

Based on the table above the "master" always holds the support for the latest version of the SIF3 Generator and SIF3 Framework. 

### Update as of Feb 10, 2021
The SIF3 Framework supports infrastructure namespace mapping. This in turn means that it is possible to use the latest version of 
the SIF3 Datamodel Generator and latest version of the SIF3 Framework for SIF Adapters that run with an older versions of the SIF Infrastructure. For details refer to section 5.16 in the Developer's Guide of the SIF3 Framework. Basically the SIF3 Framework can
now run with any infrastructure version. **For the SIF3 Datamodel Generator this means that the fw15-plus branch will be decommissioned**.

# Build Instructions using build.xml
There is an ant.properties file at the top level of this project. This is the place where settings need to change to build
a particular data model library. The three properties to be set are documented in that file including an example for
each locale (AU, US). Once these properties are set then follow the steps listed below for each locale.

## SIF AU:
1. Run the **10-generate-AU-DM** (Generate POJOs for AU Data Model) ant target. This will generate the Java POJOs for 
   the chosen data model. The POJOs can be found in the Generator/data/output/ directory.
2. Remove all java classes in the sif3Datamodel/src/sif/dd/au30/model source directory.
3. Copy the generated POJOs from step 1) to the directory of step 2).
4. Run the **15-jar-AU-DM** (Build jar for SIF AU data model) ant target. This will build a jar file into the build/dist 
   directory. This jar file can now be used in your SIF3 Project.
  
## SIF US:
1. Run the **20-generate-US-DM** (Generate POJOs for US Data Model) ant target. This will generate the Java POJOs for 
   the chosen data model. The POJOs can be found in the Generator/data/output/ directory.
2. Remove all java classes in the sif3Datamodel/src/sif/dd/us<version>/model source directory.
3. Copy the generated POJOs from step 1) to the directory of step 2).
4. Run the **25-jar-US-DM** (Build jar for SIF US data model) ant target. This will build a jar file into the build/dist 
   directory. This jar file can now be used in your SIF3 Project.
   
## SIF US - Unity:
1. Run the **30-generate-NAUnity-DM** (Generate POJOs for NA Unity Data Model) ant target. This will generate the Java 
   POJOs for the chosen data model. The POJOs can be found in the Generator/data/output/ directory.
2. Remove all java classes in the sif3Datamodel/src/unity/model source directory.
3. Copy the generated POJOs from step 1) to the directory of step 2).
4. Run the **35-jar-NAUnity-DM** (Build jar for SIF NA Unity data model) ant target. This will build a jar file into the
   build/dist directory. This jar file can now be used in your SIF3 Project.

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
- Modified this README.md file to accurately reflect available data models within this project.

## Version from October 23, 2016
- Added SIF AU 3.4 XSD (data/input/XSD/sifau30/au3.4 directory) and generated data model classes 
  for SIF AU 3.4 (sif.dd.au30 package). This represents the officially released SIF AU 3.4 Data Model.

## Version from March 21, 2017
- Added SIF AU 3.4.1 XSD (data/input/XSD/sifau30/au3.4.1 directory) and generated data model classes 
  for SIF AU 3.4.1 (sif.dd.au30 package). This represents the officially released SIF AU 3.4.1 Data Model. This is using theau/3.4.1 namespace.
  This Namespace is now replaced with au/3.4. (see June 9, 2017 release below).

## Version from November 9, 2017
- Added SIF AU 3.4.2 XSD (data/input/XSD/sifau30/au3.4.2 directory) and generated data model classes for officially released SIF AU 3.4.2. 
  for SIF AU 3.4.2 (sif.dd.au30 package). This represents the officially released SIF AU 3.4.2 Data Model. This is using the au/3.4 namespace.
  
## Version from October 2, 2018
- Added SIF AU 3.4.3 XSD (data/input/XSD/sifau30/au3.4.3 directory) and generated data model classes for officially released SIF AU 3.4.3. 
  for SIF AU 3.4.3 (sif.dd.au30 package). This represents the officially released SIF AU 3.4.3 Data Model. This is using the au/3.4 namespace.
- **Project now requires Java 8**. The Project is now built with Java 8 as the minimal java version. Libraries used by this project may require Java 8 in future.

## Version from October 23, 2018
- Added SIF AU 3.4.4 XSD (data/input/XSD/sifau30/au3.4.4 directory) and generated data model classes for the draft of SIF AU 3.4.4. Note that this is an **early draft** for SIF AU 3.4.4 

## Version from Jan 22, 2019
- Added SIF AU 3.4.4 XSD (data/input/XSD/sifau30/au3.4.4 directory) and generated data model classes for the draft of SIF AU 3.4.4. Note that this is an **early draft** for SIF AU 3.4.4 9v2)
- Updated to SIF3 Framework library v0.14.0. 

## Version from Jan 31, 2019
- Updated to SIF3 Framework library v0.14.1. 

## Version from Feb 14, 2019
- Updated with official SIF AU 3.4.4 release. XSD & POJOs. 

## Version from May 28, 2019
- Updated with final SIF AU 3.4.4 release. XSD & POJOs (includes errata). 

## Version from June 12, 2019
- Added NA Unity 4.0 support. 

## Version from JUNE 16, 2020
Add support for PESC JSON. Note if the artifacts/libraries produced with this project are being used with the SIF3 Framework
(https://github.com/Access4Learning/sif3-framework-java) then you should refer to the instructions in the 
"**Summary - Usage with SIF3 Framework**" section first for details which version/branch of this project you should use.

## Version from Sept 22, 2020
- Updated with official SIF AU 3.4.4 release. XSD & POJOs. 

## Version from Oct 19, 2020
- Minor update to the sif3.3Common-0.15.0.jar file. Enforces lower case "value" for JAXB property called 'value' for 
  data models that use the upper camel case naming convention otherwise. 

## Version from Feb 10, 2021
- Minor update to the sif3.3Common-0.15.0.jar file. Support for infrastructure namespace mapping. 

## Version from April 13, 2021
- Updated with official SIF AU 3.4.8 release. XSD & POJOs. 

# Download Instructions
How to download this project:

## Option 1 - As a Zip.
Click on the button marked "ZIP" available from the Code tab.

## Option 2 - Using a Git client.
From the command-line type: git clone git://github.com/Access4Learning/SIF3DMGenerator-Java.git

Note that if you want to use this option but don't have the client installed, it can be 
downloaded from http://git-scm.com/download.


