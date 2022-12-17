window.onload = function () {
    debugger;
    diploma.Init();
}

let diploma = {

    bttnDownload: document.getElementById("bttndownload"),
    bttnDescargar: document.getElementById("bttnSolicitardescarga"),

    Init: function() {
        debugger;
        this.ConfigurarEventos();
    },
    ConfigurarEventos: function() {
        debugger;
        this.bttnDownload.addEventListener("click", this.Download);
        this.bttnDescargar.addEventListener("click", this.Descargar);    
    },


function funciones(){
    if( action == 1){
        aumentar();
        action = 2;
    }else{
        decrementar();
        action= 1;
    }
}


}
