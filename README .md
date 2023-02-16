
#Description
Ce projet est un test de prise en main du moteur de règles Drools. 
Le but est d'évaluer votre capacité à prendre en main l'utlisation de Drools. Vous pouvez consulter n'importe quelles ressources pour résoudre l'exercice mais vous devez le faire vous même. Cet exercice consiste à réaliser un fichier de config drools pour un petite cas d'utilisation simulant le calcul de rabais lors de l'achat d'un bien en fonction de plusieurs paramètres. Il s'agira ensuite de tester ce fichier graçe à des test unitaires

Vous devez composer le fichier Regles.xlsx pour y inclure les règles de calcul de la réduction de prix en fonction de l'âge du client, du montant de l'achat et du type du client (VIP ou NORMAL).
Vous devez executer les tests dans le projet sans modifier le code.

<p>Le fichier Regles.xlsx vide se trouve dans les resources du projet</p>


# Niveau 1

Dans le fichier Rules.xlsx créez le tableau des règles drools en fonction des données ci-dessous

### Les valeurs exactes:

<table>
 <tr>
    <th>Age</th>
    <th>Client VIP</th>
    <th>Montant</th>
    <th>Réduction (%)</th>
</tr>
<tr>
 <td>moins de 65</td>
 <td>NORMAL</td>
 <td>plus de 500</td>
 <td>10</td>
</tr>
<tr>
 <td>moins de 65</td>
 <td>NORMAL</td>
 <td>plus de 2000</td>
 <td>15</td>
</tr>
<tr>
 <td>moins de 65</td>
 <td>NORMAL</td>
 <td>plus de 5000</td>
 <td>20</td>
</tr>
<tr>
 <td>moins de 65</td>
 <td>VIP</td>
 <td>plus de 500</td>
 <td>20</td>
</tr>
<tr>
 <td>moins de 65</td>
 <td>VIP</td>
 <td>plus de 2000</td>
 <td>25</td>
</tr>
<tr>
 <td>moins de 65</td>
 <td>VIP</td>
 <td>plus de 5000</td>
 <td>30</td>
</tr>
<tr>
 <td>plus de 65</td>
 <td>NORMAL</td>
 <td>plus de 500</td>
 <td>15</td>
</tr>
<tr>
 <td>plus de 65</td>
 <td>NORMAL</td>
 <td>plus de 2000</td>
 <td>20</td>
</tr>
<tr>
 <td>plus de 65</td>
 <td>NORMAL</td>
 <td>plus de 5000</td>
 <td>25</td>
</tr>
<tr>
 <td>plus de 65</td>
 <td>VIP</td>
 <td>plus de 500</td>
 <td>25</td>
</tr>
<tr>
 <td>plus de 65</td>
 <td>VIP</td>
 <td>plus de 2000</td>
 <td>30</td>
</tr>
<tr>
 <td>plus de 65</td>
 <td>VIP</td>
 <td>plus de 5000</td>
 <td>35</td>
</tr>
</table>

Mettez la valeur de la réduction dans discountValue du data object et faites fonctionner le test DroolsLevel1Test

#Niveau 2

N'importe quel client peut avoir un code de réduction en supplément.
Rajoutez plus de règles dans le fichier Rules.xlsx 
* "Code1" et "Code2" donnent la réduction supplémentaire de 20%
* "Code3" donne la réduction supplémentaire de 30%
* Mettre le champ fullDiscountValue comme la somme des réductions (la réduction du code + discountValue)
* si fullDiscountValue est supérieur à 40% limiter fullDiscountValue à 40%

Mettez la valeur de la réduction dans fullDiscountValue du data object et faites fonctionner le test DroolsLevel2Test

**Astuce**: regarder Stateful Knowledge Session et la fonction _modify_(...)



# La documentation

* [Decision Tables in Spreadsheets](https://docs.jboss.org/drools/release/5.5.0.Final/drools-expert-docs/html_single/#d0e1157)
* [Defining spreadsheet decision tables](https://access.redhat.com/documentation/en-us/red_hat_decision_manager/7.3/html-single/designing_a_decision_service_using_spreadsheet_decision_tables/index#decision-tables-defining-proc)


