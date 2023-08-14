./build.sh
cd ../classes || echo "ERROR: Faild command 'run'"
jar -cvmf ./../forJar/MANIFEST.MF ./../jarFiles/StudentManager.jar ./StudentManager/*