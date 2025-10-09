*** Settings ***

Library     SeleniumLibrary

*** Test Cases ***
Pesquisa no Google
    [Documentation]     Pesquisa por "Robot Framework" no Google e verifica o título da página
    Open Browser    https://www.google.com      Chrome
    Input Text  name=q      Robot Framework
    Press Keys  name=q      ENTER
    Sleep   2s
    Capture Page Screenshot
    Close Browser