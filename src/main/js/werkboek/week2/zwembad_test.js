const {Zwembad} = require("./zwembad")
const assert = require('assert');

suite('Zwembad', () => {
    setup(() => {

    });


    test('Kan inhoud berekenen', () => {
        let zwembad = new Zwembad(2, 4, 2);
        assert.equal(16, zwembad.inhoud);
    });

});
