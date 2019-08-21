<?php
    $op = $_GET['op'];
    $n1 = $_GET['n1'];
    $n2 = $_GET['n2'];

    switch ($op) {
        case '+':
            $resultado = $n1+$n2;
            break;
        case '-':
            $resultado = $n1-$n2;
            break;
        case '*':
            $resultado = $n1*$n2;
            break;
        case '/':
            $resultado = $n1/$n2;
            break;
        default:
            $resultado = 'Operação invalida';
            break;
    }
    echo "Calculo: $n1 $op $n2 = $resultado";
?>