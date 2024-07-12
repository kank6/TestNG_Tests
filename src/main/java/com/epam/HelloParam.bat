@echo off

rem Check if the parameter is provided
if "%~1" == "" (
    echo Usage: %0 [name]
    exit /b 1
)

rem Use the parameter passed to the script
echo Hello %1
