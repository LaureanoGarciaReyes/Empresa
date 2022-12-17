window.onload = function () {
    debugger;
    AccesoZoom.Init();
}

let AccesoZoom = {
    // Declaracion de controles
    lisTalleres: document.getElementById("lisTalleres"),

    CargarPagina: function () {
        let IdTallerSeleccionado = AppStorage.Obtener(AppStorage.IdTallerSeleccionado);
        AccesoZoom.lisTalleres.Value = IdTallerSeleccionado;
    },

    ConfigurarEventos: function() {
        debugger;
        this.lisTalleres.addEventListener("change", this.SelecTaller);
        
    },
    
    Init: function () {
        AccesoZoom.ConfigurarEventos();
        AccesoZoom.CargarPagina();
    }
}