<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel='stylesheet' href='../css/estilo.css'>
    <title>editar republica</title>
</head>

<body>
    <div class="container">
        <div class="title-top">
            <div class="title">
                <span>Universidade - República: Editar</span>
            </div>
            <div>
                <button class="btn-cadastrar" onclick="location.href='../index.php'">HOME</button>
            </div>
        </div>
        <div class="form-int">
            <form action="../control/editar_control.php" method="post">
                <?php
                include "../control/connect.php";
                $id = $_GET['id'];
                $sql = mysqli_query($link, "SELECT * FROM `republica` WHERE IdRep = $id");
                $vetor = mysqli_fetch_array($sql);
                echo '
                        <label for="id">Id: ' . $vetor["idRep"] . ' </label>
                        <br>
                        <input type="hidden" name="id" value="' . $vetor["idRep"] . '" required  readonly=“true” ><br>
                        <br>
                        <label for="nome"> Nome da República: </label>
                        <br>
                        <input type="text" name="nome" value="' . $vetor['Nome'] . '" required><br>
                        <br>
                        <label for="endereco"> Endereço: </label>
                        <br>
                        <input type="text" name="endereco" value="' . $vetor['Endereco'] . '" required><br>
                        <br>
                        <button type="submit">ATUALIZAR</button>  <button onclick="location.href="../index.php"">CANCELAR</button>
                    ';
                ?>
            </form>
        </div>
    </div>
</body>

</html>