
exports.up = function(knex, Promise) {
    return knex.schema.alterTable('articles', table =>{
        table.string('imageUrl', 1000).alter()
    })

};

exports.down = function(knex, Promise) {
    return knex.schema.alterTable('articles', table =>{
        table.string('imageUrl', 1000).notNull().alter()
    })
};
