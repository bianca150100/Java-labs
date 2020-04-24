
Modificari fata de prima parte:
1. Mi-am structurat proiectul in pachete: Model, Serviciu + clasa Main
2. Am schimbat denumirea claselor

Partea a doua a proiectului:
Am avut 2 abordari:
Prima abordare (in pachetul csv)
1.Am creat interfata CsvInterface cu metode ce vor fi suprascrise in clasele pentru care doresc afisarea
2. Clasa CsvScriere - clasa generica
3. Clasa CsvAfisare - clasa generica
4. TestCitire si TestAfisare - clase de test pt aceasta abordare


A doua abordare - clase Singleton (in pachetul csvSingleton)
1. La citire returnez un List<String> ce vor fi ulterior folosite pentru a crea un nou obiect
2. La afisare primesc ca parametru un List<String> pe care le afisez corespunzator
  

ServiciuMemorare -> este folosit pentru a retine in memorie datele din fisierele CSV
ServiciuAudit -> clasa Singleton ce afiseaza intr-un fisier Csv fiecare serviciu definit la partea1 -> modul de utilizare poate fi observat in clasa Main
  
