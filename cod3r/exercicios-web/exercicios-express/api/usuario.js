function salvar(req, res){
    res.send('Usuario > salvar')
}

function obeter(req, res){
    res.send('Usuario > obter')
}

module.exports = {salvar, obeter}