serverWebServices projesi web servisleri;

http://localhost:8080/ =====================> index          DÖNER.
http://localhost:8080/Hello/merhaba ========> Merhaba.       DÖNER.
http://localhost:8080/Hello/merhaba/Fatih ==> Merhaba. Fatih DÖNER.

Projenin Çalıştırılması;

/home/fdurmus/programs/jdk/jdk-22/bin/java -jar /home/fdurmus/fdWorkspaces/cihanProject/serverWebServices/out/artifacts/serverWebServices_jar/serverWebServices.jar 




clientWebServices projesi web servisleri;

http://localhost:8082/ ==> Reader Index
http://localhost:8082/ReaderHello/TestMerhaba/Fatih ==> Merhaba. Fatih
http://localhost:8082/ReaderHello/ReaderMerhaba ==> API SERVİSE ULAŞILAMIYOR ==> I/O error on GET request for "http://localhost:8080/Hello/merhaba": Connection refused
http://localhost:8082/ReaderHello/ReaderMerhaba ==> READ SERVİCE ==> Merhaba. 1725754236576

Projenin Çalıştırılması;

/home/fdurmus/programs/jdk/jdk-22/bin/java -jar /home/fdurmus/fdWorkspaces/cihanProject/clWebServices/out/artifacts/clWebServices_jar/clWebServices.jar
