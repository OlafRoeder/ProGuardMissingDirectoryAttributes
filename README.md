# SSCCE for https://github.com/Guardsquare/proguard/issues/110
Demo that shows ProGuard 7.0.0 misses file attributes in generated jar.
* requirements: JDK 8
* build with <i>gradlew proguard</i>

Using ProGuard 7.0.0 will result in a jar-file without file attributes,
so calls to <i>MyClass.class.getResource("pathToDirectory")</i> returns <u>null</u> instead of the desired directory


![screenshot of jar output](https://github.com/OlafRoeder/ProGuardMissingDirectoryAttributes/blob/master/src/main/resources/jarOutputScreenshot.png?raw=true "screenshot of jar output")