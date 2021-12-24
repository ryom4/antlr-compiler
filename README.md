## Intèrpret i pretty printer pel Llull

### Instal·lació
<pre>
pip3 install -r requirements.txt
</pre>

### Compilació de la gramàtica i generador de visitor
<pre>
antlr4 -Dlanguage=Python3 -no-listener -visitor llull.g4
</pre>

### Usage intèrpret
Per executar un programa:
<pre>
python3 llull.py prog.llull
</pre>
Per executar des d'un procediment diferent de main:
<pre>
python3 llull.py prog.llull proc param1 param2 ...
</pre>

### Usage pretty printer
Per imprimir el programa al terminal:
<pre>
python3 beat.py prog.llull
</pre>


