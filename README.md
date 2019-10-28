# spring-data-pcf
Steps to execute this app.
1. cf login
2. cf create-service elephantsql turtle SparkDB_Dev
3. cf push
4. cf apps
5. CRUD operations can be performed, below are Rest EndPonts.
  a. GET - /employee/
  b. GET - /employee/{id}
  c. POST - /employee/ 
            RequestBody Employee
  d. PUT -  /employee/{id}
            RequestBody Employee
  e. DELETE - /employee/{id}
  
