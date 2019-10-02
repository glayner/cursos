<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel='stylesheet' href='../css/estilo.css'>
    <title>Document</title>
</head>

<body>
    <div class="container">
        <div class="title-top">
            <div class="title">
                <span>Universidade - República: Excluir</span>
            </div>
            <div>
                <button class="btn-cadastrar" onclick="location.href='../index.php'">HOME</button>
            </div>
        </div>
        <div class="form-int">
            <form action="../control/excluir_control.php" method="post">
                <?php
                include "../control/connect.php";
                $id = $_GET['id'];
                $sql = mysqli_query($link, "SELECT * FROM `republica` WHERE IdRep = $id");
                $vetor = mysqli_fetch_array($sql);
                echo '
                <input type="hidden" name="id" value="' . $vetor["idRep"] . '" required  readonly=“true” ><br>
                
                        <label for="id">Id: ' . $vetor["idRep"] . ' </label><br><br>
    
                        <label>Nome: ' . $vetor['Nome'] . ' </label><br><br>
                    
                        <label>Endereço: ' . $vetor['Endereco'] . ' </label><br><br>
                ';
                ?>
                <div class="alr-del">Deseja realmente excluir esse registro?</div>
                <button type="submit">Excluir</button> <button onclick="location.href='../index.php'">CANCELAR</button>
            </form>
        </div>
    </div>
</body>

</html>