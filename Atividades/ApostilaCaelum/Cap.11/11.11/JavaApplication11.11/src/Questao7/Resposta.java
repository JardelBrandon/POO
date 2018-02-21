package Questao7;

/*
7) (opcional) Declare a classe ValorInvalidoException como filha direta de Exception em vez de
RuntimeException. Ela passa a ser checked. O que isso resulta?
Você vai precisar avisar que o seu método deposita() throws ValorInvalidoException, pois ela é uma
checked exception. Além disso, quem chama essemétodo vai precisar tomar uma decisão entre try-catch
ou throws. Faça uso do quick fix do Eclipse novamente!
Depois, retorne a exception para unchecked, isto é, para ser filha de RuntimeException, pois utilizaremos
ela assim em exercícios dos capítulos posteriores.

Resposta:
Como a excessão passa a ser do tipo checked, resulta que o erro será detectado 
em tempo de compilação e não em tempo de execução
*/