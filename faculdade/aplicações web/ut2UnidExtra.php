<?php
    echo "<br>";
    // $cor = ["Amarelo","Azul","Vermelho" ];
    // $cor = array("Amarelo", "Azul","Vermelho");
    // echo "<br>";
    // echo $cor[0];
    // echo "<br>";
    // echo $cor{1};
    // $cor = array('am' =>"Amarelo" ,2=>"Azul",'3'=>"Vermelho" );
    // echo "<br>";
    // echo $cor['am'];
    // echo "<br>";
    // echo $cor{2};
    // echo "<br>";
    // echo $cor['3'];
    // $cor = array(1 =>"Amarelo","Azul","Vermelho" );
    // echo "<br>";
    // echo $cor[1];
    // echo "<br>";
    // echo $cor{2};
    // echo "<br>";
    // echo $cor[3];
    
    // $endereco = array();
    // $endereco["Logradouro"] = "qnm 21 conjunto N";
    // $endereco["numero"] = "22";
    // $endereco["cidade"] = "Ceilândia Sul";
    // echo  'Desde criança vivo na '.$endereco['cidade'].' depois dá uma passada lá eu moro na '.$endereco['Logradouro'].' na casa '.$endereco['numero'];

    // $curso = ['PHP'=>$dados=[
    //     "disciplina" => "Programação em PHP",
    //     "CH" => "60 horas",
    //     "horario" => "19h - 21h"
    // ],
    // 'C'=>$dados=[
    //     "disciplina" => "Programação em C",
    //     "CH" => "60 horas",
    //     "horario" => "21h - 23h"
    //             ]];
    // echo '<br>';
    // echo ($curso['PHP']['disciplina']);
    // echo '<br>';
    // echo ($curso['PHP']['CH']);
    // echo '<br>';
    // echo ($curso['PHP']['horario']);
    // echo '<br>';
    // echo ($curso['C']['disciplina']);
    // echo '<br>';
    // echo ($curso['C']['CH']);
    // echo '<br>';
    // echo ($curso['C']['horario']);
    // echo '<br><br>';

    // foreach ($cor as $cor => $value) {
    //     echo "Chave: $cor, cor: $value <br/>";
    // }
    // echo '<br><br>';

    //     $curso = [['PHP',["Programação em PHP","60 horas","19h - 21h"]],
    //             ['C',["Programação em C","60 horas","21h - 23h"]],
    //             ['Java',["Java Swing","60 horas","21h - 23h"]]];

    // foreach ($curso as list($nome, list($disciplina,$CH,$horario))) {
    //     echo "$nome: $disciplina, $CH, $horario <br/>";
    // }

    // function multiplica($arg1, $arg2=1):float{
    //     $retorno = $arg1 * $arg2;
    //     return $retorno;
    // }
    // $resultado = multiplica(3);
    // echo $resultado;

//     function maiorMenor($a,$b,$c){
//         if(($a>$b)and($a>$c)){
//             $maior = $a;
//         }if (($b>$a) and ($b>$c)) {
//             $mario = $b;
//         } else {
//             $maior = $c;
//         }
//         if(($a<$b)&&($a<$c)){
//             $menor = $a;
//         }elseif (($b<$a)&&($b<$c)) {
//             $menor = $b;
//         }else{
//             $menor = $c;
//         }
//         return [$maior,$menor];
//     }
//   var_dump(list($maior,$menor) = maiorMenor(4,2,9));

//   function trocaDeValor(&$num1,&$num2){
//       $temp = $num1;
//       $num1 = $num2;
//       $num2 = $temp;
//   }
//   $x = 10;
//   $y = 5;
//   trocaDeValor($x,$y);
//   echo "x: $x, y: $y";

// function imprime(...$args){
//     foreach ($args as $key => $value) {
//         echo "Parametro $key: $value <br/>";
//     }
// }
// imprime('thiago', 'Glayner', 'Cunha','Rodrigues')

// $mensagem = function ($nome){
//     echo "Seja bem-vindo $nome!";
// };
// $mensagem('Thiago');
//     echo "<br>";
// $mensagem("Maise");

// $jogador = [
//     ["nome"=>"Pelé", "nota"=>9],
//     ["nome" => "Maradona", "nota"=>8],
//     ["nome" => "Zico", "nota" => 7]
// ];
// usort($jogador, function($jogador1, $jogador2){
    // return ($jogador1['nota'] < $jogador2['nota']) ? -1 : 1;
// });
// print_r($jogador);

// echo date("d/m/y ");
// echo date(" H:i:s");

// $d1 = date("Y/m/d");
// $d2 = "2017-12-16";
// if($d1 < $d2)
//     echo "$d1 é menor que $d2";
// else 
//     echo "$d2 é menor que $d1";

// $agora = new DateTime();
// $novaData = new DateTime("2017-12-15");
// $amanha = new DateTime("+1 day");

// echo ($agora-> format("d/m/Y  H:i:s"));
// echo '<br>';
// echo ($novaData-> format("d/m/Y  H:i:s"));
// echo '<br>';
// echo ($amanha-> format("d/m/Y  H:i:s"));

// $dataComeco = new DateTime('2019-08-01');
// $dataTermino = new DateTime();
// $diferenca = $dataComeco->diff($dataTermino);
// echo $diferenca->format("%R%a dias");

// $dt = new DateTime();
// $dt->add(new DateInterval("P1M1D"));
// echo $dt->format("d/m/Y");
// echo '<br>';
// $dt->add(new DateInterval("P1Y"));
// echo $dt->format("d/m/Y");

// function periodo($dataInicio,$dataFim){
// $dataInicial = new DateTime($dataInicio);
// $dataFinal = new DateTime($dataFim);
// $intervalo = $dataInicial->diff($dataFinal);
// $data = new DateTime($dataInicial->format('Y/m/d'));
// $i=0;
// do {    
//     echo $data->format('d/m/Y');
//     $data->add(new DateInterval("P1D"));
//     echo '<br>';
//     $i++;
// } while ($i <= $intervalo->format("%a"));
// }
// periodo("2017-12-01","2017-12-10");


// function geraNumeros(){
//     $i = 0;
//     $numeros = array();
//     while($i < 6){
//         $r = rand(1,60);
//         $flag = 0;
//         for ($j=0; $j < $i ; $j++) { 
//             if($numeros[$j] ==$r){
//                 $flag = 1;
//             }
//         }
//             if($flag == 0){
//                 $numeros[$j] = $r;
//                 $i++;
//             }
        
//     }
//         sort($numeros);
//         return $numeros;
// }
// for ($i=1; $i <= 10 ; $i++) { 
//     $numeros = geraNumeros();
//     echo "$i: ";
//     foreach ($numeros as $key => $value) {
//         echo "$value ";
//     }
//     echo "<br/>";
// }

?>