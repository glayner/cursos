<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel='stylesheet' href='css/estilo.css'>
    <title>Controle de Republicas</title>
</head>

<body>

    <div class="container">
        <div class="title-top">
            <div class="title">
                <span>Universidade - República:</span>
            </div>
            <div>
                <button class="btn-cadastrar" onclick="location.href='model/cadastrar.php'">+ Cadastrar</button>
            </div>
        </div>
        <div>
            <table class="tabela-index" border=1 cellspacing=0 cellpadding=2 bordercolor="666633">
                <thead>
                    <tr class="table-title">
                        <th scope="col">Id</th>
                        <th scope="col">Nome</th>
                        <th scope="col">Endereço</th>
                        <th scope="col">Ação</th>
                    </tr>
                </thead>
                <tbody>
                    <?php
                    echo "<br>";
                    include "control/connect.php";
                    $sql = mysqli_query($link, "SELECT * FROM `republica`");
                    while ($vetor = mysqli_fetch_array($sql)) {
                        $id = $vetor['idRep'];
                        $nome = $vetor['Nome'];
                        $endereco = $vetor['Endereco'];

                        echo '<tr class="table-bd">';
                        echo '<th scope="row">' . $id . '</th>';
                        echo '<td>' . $nome . '</td>';
                        echo '<td>' . $endereco . '</td>';
                        echo '<td width=300 class="td-button">';
                        // echo "<button onclick='location.href="model/editar.php?id= . $id .">Editar</a></button>";
                        echo("<button onclick=\"location.href='model/editar.php?id=".$id."'\">Editar</button>");
                        echo ' ';
                        // echo '<button><a class="btn btn-danger" href="model/excluir.php?id=' . $id . '">Excluir</a></button>';
                        echo("<button onclick=\"location.href='model/excluir.php?id=".$id."'\">Excluir</button>");
                        echo '</td>';
                        echo '</tr>';
                    }
                    ?>

                </tbody>
            </table>
        </div>
        <div class="btn-baixo">
        <button class="btn-cadastrar" onclick="location.href='model/cadastrar.php'">+ Cadastrar</button>
        </div>
    </div>
</body>

</html>