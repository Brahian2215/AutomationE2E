#Author: Equipo de Calidad
#Language: en

Feature: Busqueda de flotas en el Input de Buscar flota

    Como usuario del sistema FleetGuard360
    Quiero buscar informacion relacionada con una flota
    Para conocer la disponibilidad de dicha flota


    Scenario: Consultar una flota por nombre
        Given que el usuario accede a la aplicacion en la GUI de Informacion de Flotas
        When busca una flota con el nombre Cootranscol
        Then deberia ver la información de dicha flota en la tabla