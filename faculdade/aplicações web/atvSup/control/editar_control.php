<?php
    include "connect.php";
    $id = trim($_POST['id']);
    $nome = trim($_POST['nome']);
    $endereco = trim($_POST['endereco']);
    if($id && $nome && $endereco){
        mysqli_query($link, "UPDATE `republica` SET `Nome` = '$nome', `Endereco` = '$endereco' WHERE `republica`.`idRep` = $id");
        header('Location: ../index.php');
    }else {
        echo  "<script>
            javascript:alert('Ocorreu algum problema! Verifique se os campos estão preenchidos.');
            javascript:window.location='../model/editar.php?id=$id' ;
        </script>";
    }
?>