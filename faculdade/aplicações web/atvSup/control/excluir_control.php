<?php
    include "connect.php";
    $id = trim($_POST['id']);
    if($id){
        mysqli_query($link, "DELETE FROM `republica` WHERE `republica`.`idRep` = $id");
        header('Location: ../index.php');
    }else {
        echo  "<script>
            javascript:alert('Ocorreu algum problema! Verifique se existe um registro selecionado.');
            javascript:window.location='../index.php' ;
        </script>";
    }
?>