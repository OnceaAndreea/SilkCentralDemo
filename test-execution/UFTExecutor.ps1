mkdir build
$TESTS_TO_RUN_XML = $env:testsToRunConverted -replace ('\${workspace}', -join($env:WORKSPACE, "\test-execution"))
$WORKSPACE_ESCAPED = $env:WORKSPACE -replace ('\\', '\\') -replace ('[ ]', '%20')
$WORKSPACE_ESCAPED2 = $env:WORKSPACE -replace ('\\', '\\')
Set-Content -Path ./build/testsToRun.mtbx -Value $TESTS_TO_RUN_XML
Set-Content -Path ./build/Props.txt -Value "runType=FileSystem"
Add-Content -Path ./build/Props.txt -Value "resultUnifiedTestClassname=true"
Add-Content -Path ./build/Props.txt -Value "resultsFilename=build\\Results.xml"
Add-Content -Path ./build/Props.txt -Value "Test1=$WORKSPACE_ESCAPED2\\test-execution\\build\\testsToRun.mtbx"
Get-Content -Path ./build/Props.txt
Start-Process -FilePath "FTToolsLauncher.exe" -ArgumentList "-paramfile `"$PWD/build/Props.txt`"" -Wait *>&1
$resultsContent = Get-Content -Path ./build/Results.xml
$WORKSPACE_PATH = -join($WORKSPACE_ESCAPED, "\\test-execution\\");
$WORKSPACE_PATH2 = -join($WORKSPACE_ESCAPED2, "\\test-execution\\");
$newResultContent = $resultsContent -replace('/','\') -replace ($WORKSPACE_PATH, '') -replace ($WORKSPACE_PATH2, '') -replace ('file:\\\\\\', '') -replace ('<\\','</') -replace ('\\>','/>') -replace('xmlns:xsi="[^"]*"','') -replace('xmlns:xsd="[^"]*"','') -replace ('package=\"FTToolsLauncher\"','')
$newResultContent | Set-Content -Path ./build/Results.xml
