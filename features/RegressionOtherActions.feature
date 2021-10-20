@supertstcucu @RegressionOtherActions
Feature: RegressionOtherActions
    
    @ChangeDriverScen
    Scenario: ChangeDriverScen
    Given Abrir un nuevo navegador a la pagina JIRAITO
    And Comprobar que estamos en la pagina WIKIPEDIA
    When Abrir un nuevo navegador a la pagina Gmail
    And Abrir la pestaña para realizar el inicio de sesion
    And Comprobar que podemos realizar el inicio de sesion
    When Volver a la pestaña de Gmail
    And Comprobar que estamos en la pagina Gmail
    Then Volver a la pagina CAD
    And Comprobar que estamos en la pagina CAD
    
    
    @UpdateFileScen
    Scenario: UpdateFileScen
    Given Crear proyecto llamado uploadproject
    And Acceder al modulo de Testing1
    When Subir un fichero y comprobar la correcta subida
    
    