# Recherche-mots
Algorithme<hr><br>
Entrée : Requête + corpus arabe<br>
Sortie : Listes des réponses pertinents<br>
Début<br>
-Pour la requête initiale et chaque document de corpus.<br>
•	Segmentation.<br>
•	Normalisation.<br>
•	Suppression des « stop words ».<br>
•	Stemmatisation<br>
•	Indexation.<br>
Fin pour<br>
-Enrichissement sémantique de la requête analysée<br>
-Pour chaque document traité faire  <br>
•	Calcul de similarité entre document et requête enrichie.<br>
Fin pour<br>
-Extraction de réponses pertinents <br>
Fin<br>

Explication<hr><br>
Analyse de requête :<br>
On va appliquer : <br>
•	Normalisation<br>
Exemple : ماهو مرض الايدز؟<br>
Resultat de normalisation est : ماهو مرض الايدز<br>
•	Elimination des mots vides (من, ما, ماهي)<br>
Exemple(en utilisant la question précèdent) est  : مرض الايدز<br>
•	Extraction des ressources de l’arbre syntaxique sert à l’extraction de la dernière expression nominale (PN) de la question <br>
Exemple : l’arbre syntaxique de la question precedant est : <br>
 
Le résultat de l’extraction de ressource (la dernière PN) est : الايدز<br>
•	Extraction de mot clé : Les mots-clés sont des mots qui ne sont pas supprimés.<br>
Exemple : Dans la phrase ماهو مرض الايدز؟<br>
L’enlèvement des mots vides donne : ماهو. La ressource est alors الايدز. Le reste مرض est le<br>
mot-clé de la question en langage naturel.<br>
•	Liste de mots clés : Extension des mots-clés<br>
Nous utilisons WordNet arabe<br>
Exemple : pour le predicat : مرض<br>
 
Après un va représenter la requête sous forme d’un vecteur (utilisant le word2vec pour convertir la requête en vecteur)<br>
Analyse de documents(corpus)<br>
Pour chaque corpus , on applique :<br>
•	Normalisation et segmentation<br>
Exemple : texte à normaliser<br>
 resultat : <br>
 
•	Eliminer les mots vides<br>
•	Stemming<br>
•	Indexation :exemple de résultat<br>
 
 
Puis le document sera présenté sous forme vectoriel (utilisant wor2vec)<br>
•	Recherche dans des documents.<br>
C’est-à-dire exécuter la requête (avec liste des mots clés) qui est sous forme d’un vecteur.<br>
Calcul la similarité entre les vecteurs de requêtes et le vecteur de documents<br>
•	Extraction de réponses pertinents<br>

N.B<hr>
<br>

•	Pour l’analyse et le traitement, on utilise la plateforme SAFAR<br>
•	J’utilise le NetBeans<br>
