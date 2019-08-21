<?php
echo '<br>';
    // $x=1; $y=1;
    // if ($x === $y) 
    //     echo "$x e $y são iguais.";
    
    // $media = 8.5;
    
//     if(($media >=8) and ($media <=9))
//         $conceito = "B";
//     elseif (($media >=9.1) && ($media <=9.9))
//         $conceito = "A";
//     elseif ($media >= 10) 
//         $conceito = "S";
//     elseif (($media >=6) && ($media <=7.9))
//         $conceito = "C";
//     elseif (($media >=4) && ($media <=5.9))
//         $conceito = "D";
        
//     else 
//         $conceito = "F";
//     echo "seu conceito é $conceito";
// echo '<br>';
//     switch ($conceito) {
//         case 'S':
//             echo "Aprovado com perfeição";
//             break;
//         case 'A':
//             echo "Aprovado com distinção";
//             break;
//         case 'B':
//             echo "Plenamente aprovado";
//             break;
//         case 'C':
//             echo 'Aprovado';
//             break;
//         case 'D':
//             echo 'Reprovado';
//             break;
//         default:
//             echo 'Fracassado';
//             break;
//     }

// $situacao = ($media >= 7) ? "Aprovado" : "Reprovado";
// echo "O aluno está: $situacao";

// $i = 0;
// while ($i <= 10) {
//     $i++;
//     if(($i>=3)&&($i<=6))
//         continue;
//     echo $i;
//     echo '<br>';
// }

// do {
//     if($i===6)
//         break;
//     echo $i;
//     $i++;
// } while ($i <=10);

// for ($i=1; $i <=10 ; $i++) { 
//    echo $i;
// }

$i= 1;
while ($i <= 100) {
   $primo= 1;
    for ($n= 2; $n < $i; $n++) {
       if ($i % $n == 0) {
        $primo= 0;
        break;
        } 
    }   
    if ($primo == 1)
        echo "$i ";
    $i++;
} 
?>
