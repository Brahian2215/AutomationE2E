#Author: Equipo de Calidad
#Language: en

Feature: Actualizar monitoreo en tiempo real de una flota con el Boton de Actualizar Informacion

  Como administrador del sistema FleetGuard360
  Quiero actualizar la informacion de monitoreo relacionada con una flota
  Para conocer su desempeño y el cumplimiento de las políticas

  Scenario: Actualizar informacion de monitoreo de una flota
    Given que el administrador accede a la aplicacion en la GUI de Indicadores de Monitoreo de Flotas
    When actualiza los indicadores de monitoreo de una flota
    Then deberia ver la informacion de monitoreo de flotas actualizada en tiempo real

  Scenario: Fallo en la actualizacion de monitoreo de una flota
    Given que el administrador accede a la aplicacion en la GUI de Indicadores de Monitoreo de Flotas
    When actualiza los indicadores de monitoreo de una flota
    Then deberia ver un mensaje indicando que la informacion no pudo ser actualizada