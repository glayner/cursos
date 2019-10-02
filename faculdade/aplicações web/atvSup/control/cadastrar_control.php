<?php
include "connect.php";

$nome = trim($_POST['nome']);
$endereco = trim($_POST['endereco']);
if($nome && $endereco){
    mysqli_query($link, "INSERT INTO `republica` (`Nome`, `Endereco`) VALUES ('$nome', '$endereco')");
    header('Location: ../index.php');
}else{
    echo  "<script>
        javascript:alert('Ocorreu algum problema! Verifique se os campos foram preenchidos.');
        javascript:window.location='../model/cadastrar.php';
    </script>";
}

?>