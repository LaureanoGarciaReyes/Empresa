

let AppStorage = {

    IdTallerSeleccionado: "AppStorage.Usuario.IdTallerSeleccionado",

    ValidaStorage: function () {
        if (typeof (Storage) === "undefined") {
            alert("Storage no esta disponible");
            return false;
        }
        return true;
    },

    Registrar: function (llave, dato) {
        if (AppStorage.ValidaStorage()) {
            localStorage.setItem(llave, dato);
        }

    },
    Obtener: function (llave) {
        if (AppStorage.ValidaStorage()) {
            return localStorage.getItem(llave);
        }
        else {
            return undefined;
        }
    },

    Init: function () {

        if (AppStorage.ValidaStorage());

    }
}


