*** Settings ***
Library     SeleniumLibrary

*** variables ***
${BROWSER}      chrome
${BASE_URL}     https://unifil.br/
${PRESENCIAL}   https://unifil.br/presencial/
${EAD}          https://unifil.br/ead/
${POS}          https://unifil.br/pos

*** Test Case ***

Acessar Página Principal
    [Tags]      smoke
    Open Browser        ${BASE_URL}     ${BROWSER}
    Maximize Browser Window
    Page Should Contain     UniFil
    Capture Page Screenshot
    Close Browser

Acessar Página Presencial
    [Tags]      smoke
    Open Browser        ${PRESENCIAL}       ${BROWSER}
    Maximize Browser Window
    Page Should Contain     Presencial
    Capture Page Screenshot
    Close Browser

Acessar Página EAD
    [Tags]      smoke
    Open Browser    ${EAD}      ${BROWSER}
    Maximize Browser Window
    Page Should Contain     EAD
    Capture Page Screenshot
    Close Browser

Acessar Página POS
    [Tags]      smoke
    Open Browser    ${POS}      ${BROWSER}
    Maximize Browser Window
    Page Should Contain     Pós
    Capture Page Screenshot
    Close Browser
