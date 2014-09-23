#########################################################################################################
# Copyright 2014 Systemic Pty Ltd
# 
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
# 
# Unless required by applicable law or agreed to in writing, software distributed under the License 
# is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
# or implied.
# See the License for the specific language governing permissions and limitations under the License.
########################################################################################################

#########################################################################################################
# Summary
#########################################################################################################

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

As of September 23, 2014 the following SIF Locale Data Models are supported by this project
- SIF AU 1.3 for Infrastructure 3.0.1
- SIF NA (North America) 3.2

There is an Ant build script provided that will build the final jar file for the selected locale. 
The ant tasks to use are:
- 10-jar-dd-au13for30: Builds the Data Model Library (jar) for SIF AU 1.3 for Infrastructure 3.0.1
- 15-jar-dd-us32: Build the Data Model Library (jar) for SIF NA 3.2

The built jar files can be found in the build/dist directory.

#########################################################################################################
# Version History and Update
#########################################################################################################

===============================
Version from September 23, 2014
===============================
Initial submission.

#########################################################################################################
# Download Instructions
#########################################################################################################

How to download this project:

Option 1 - As a Zip.
====================
Click on the button marked "ZIP" available from the Code tab.


Option 2 - Using a Git client.
==============================
From the command-line type: git clone git://github.com/nsip/SIF3DMGenerator-Java.git

Note that if you want to use this option but don't have the client installed, it can be 
downloaded from http://git-scm.com/download.


