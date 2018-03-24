# Jax-RS-Application
# Basic Inttelij Setup
## Setup Application Server in Intellij
Select Project > Click on Intellij > Preferences > Under Build, Execution and Deployement > Application Servers
Add a new Server
Configure Glassfish Server and enter Glassfish home as some:
`/Users/animjain/Documents/glassfishServer/payara41`
## Turning on the Web Application
When creating a project or module (File | New | Project or File | New | Module). On the first page of the New Project or the New Module wizard, select Java Enterprise, and then select the Web Application checkbox under Additional Libraries and Frameworks.

For an existing module. In the Project tool window (View | Tool Windows | Project), right-click the module folder and select Add Framework Support. Then select the Web Application checkbox in the dialog that opens.
## Add Artifacts for Imported/Open Projects
Select Project > File > Project Structure > Project Settings > Artifacts > Click on + if not seeing already and add exploded with default settings

## Configure Run Configurations

## References
https://www.jetbrains.com/help/idea/enabling-web-application-support.html

https://www.jetbrains.com/help/idea/creating-and-running-your-first-restful-web-service-on-glassfish-application-server.html#d122508e17

# Validate Your App
Go to Run and Select the name
validate the project at `http://localhost:8080/Jax_RS_Application_war_exploded/app/hello`
