<?php
// echo "HELLO WORLD";  

// echo "<br>";
// $var = "texto";
// echo "Agora o tipo de dado é: ".gettype($var);
// echo "<br>";
// $var = 123;
// echo "Agora o tipo de dado é:".gettype($var);  

// ${'789'} = 'abc';
// echo ${'789'};

// define('SAUDACAO', 'HELLO WORLD');
// echo SAUDACAO;

// const SAUDACAO = 'Hello World';
// echo SAUDACAO;

// $a = array(3,5, array("aaa","bbb","ccc"));
// var_dump($a);

// $preco = 100.75;
// $barato = false;
// var_dump($preco,$barato);

// phpinfo();

$var1 = 12.53;
echo "<br>";
echo "No começo, o tipo de dados é :".gettype($var1);
echo "<br>";
$var1 = false;
echo "Depois, o tipo de dados fica: ".gettype($var1);
echo "<br>";
define('OI_MUNDO', 'Oi mundo!');
echo "A tradução de Hello world é ".OI_MUNDO;
echo "<br>";
echo "A linha de código que está sendo executada é a ".__LINE__;
echo "<br>";
$var2 = "a";
echo "AS variáveis são: ";
var_dump($var1,$var2);
echo "<br>";
if($var1 <> $var2)
echo "Portanto, elas são diferentes";
else
echo "portanto, elas são iguais";
?>