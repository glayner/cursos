<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel='stylesheet' href='../css/estilo.css'>
    <title>cadastrar republica</title>
</head>

<body>
    <div class="container">
        <div class="title-top">
            <div class="title">
                <span>Universidade - República: Cadastrar</span>
            </div>
            <div>
                <button class="btn-cadastrar" onclick="location.href='../index.php'">HOME</button>
            </div>
        </div>
        <div class="form-int">
            <form action="../control/cadastrar_control.php" method="post" name='cadastro'>
                <label for="nome">Nome da República: </label>
                <br>
                <input type="text" class="inp-cad" name="nome" placeholder="digite o nome" required><br>
                <br><br>
                <label for="endereco">Endereço: </label>
                <br>
                <input type="text" class="inp-cad" name="endereco" placeholder="digite o endereco" required><br>
                <br>
                <button type="submit">CADASTRAR</button> <button onclick="location.href='../index.php'">CANCELAR</button>
            </form>
        </div>
    </div>
</body>

</html>
<!-- ALTER TABLE `republica` CHANGE `idRep` `idRep` INT(11) NOT NULL AUTO_INCREMENT; -->