# Ignition M3 Connector Module
Simple connector from Ignition to Infor M3.  (https://www.infor.com/products/m3)

## Summary
This module adds a scripting function called system.m3.getSock().

### getSock()
Returns an MvxSockJ object that can be used in Ignition scripting.
Refer to the Infor M3 documentation for the functions that this object exposes.

## Version
This module is currently tested and works with Ignition 7.8 and 7.9.

## Building this module
The module is packaged with Maven.  Use the typical maven build procedures.

The only additional requirement is that you include MvxAPI from your own repository.  It is not available in any public repositories or licensed for distribution.

Replace these lines in the main pom.xml with ones that point to your internal repository where you choose to host the mvx-api-x.x.jar:

    <repository>
		<id>thirdpartyinternal</id>
		<url>http://10.10.75.112:8081/nexus/content/repositories/thirdparty</url>
    </repository>

The inforM3-common/pom.xml includes the <dependency> that it expects to find in that internal repository.

## License
This is distributed under the MIT license.  Please feel free to contribute any changes back to this repository.  

Note: the mvx-api-x-x.jar isn't licensed for distribution, so please do not submit a PR with that file included or a complete built .modl.
