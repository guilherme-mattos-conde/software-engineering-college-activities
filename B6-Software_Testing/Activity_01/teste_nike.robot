*** Settings ***
Library     SeleniumLibrary

*** variables ***
${BROWSER}      chrome
${BASE_URL}     https://www.nike.com.br/
${CALCADOS_MASCULINOS}   https://www.nike.com.br/nav/genero/masculino/idade/adulto/tipodeproduto/calcados
${CALCADOS_FEMININOS}          https://www.nike.com.br/nav/genero/feminino/idade/adulto/tipodeproduto/calcados
${CALCADOS_INFANTIS}          https://www.nike.com.br/nav/idade/infantil/tipodeproduto/calcados

*** Test Case ***

Acessar Página Principal
    [Tags]      smoke
    Open Browser        ${BASE_URL}     ${BROWSER}
    Maximize Browser Window
    Page Should Contain     Nike
    Capture Page Screenshot
    Close Browser

Acessar Página Calçados Masculinos
    [Tags]      smoke
    Open Browser        ${CALCADOS_MASCULINOS}       ${BROWSER}
    Maximize Browser Window
    Page Should Contain     masculino
    Capture Page Screenshot
    Close Browser

Acessar Página Calçados Femininos
    [Tags]      smoke
    Open Browser    ${CALCADOS_FEMININOS}      ${BROWSER}
    Maximize Browser Window
    Page Should Contain     feminino
    Capture Page Screenshot
    Close Browser

Acessar Página Calçados Infantis
    [Tags]      smoke
    Open Browser    ${CALCADOS_INFANTIS}      ${BROWSER}
    Maximize Browser Window
    Page Should Contain     infantil
    Capture Page Screenshot
    Close Browser
