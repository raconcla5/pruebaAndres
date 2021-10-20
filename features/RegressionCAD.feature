@supertstcucu @RegressionCAD
Feature: RegressionCAD
    Background: Background_RegressionCAD
    Given Acceder a la HomePage y realizar el Login
    
    
    @CreateModelScen
    Scenario: CreateModelScen
    Given Crear un proyecto nuevo.
    And Acceder al modulo de Testing
    When Añadir la caja TestingContext
    And Añadimos la configuracion
    Then Añadimos una Suite
    When Añadimos un TestCase
    And Añadimos Steps en el Before
    And Añadimos Steps en el Execute
    And Añadimos Steps en el After
    When Añadimos un BeforeEach
    And Añadir los Steps
    Then Generar el proyecto con Main
    
    