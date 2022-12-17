window.onload = function () {
    debugger;
    perfil.Init();
}

let perfil = {

    // Declaracion de controles
    txtFormacionAcademica: document.getElementById("txtFormacionAcademica"),
    txtExperiencia: document.getElementById("txtExperiencia"),
    txtRedSocial: document.getElementById("txtRedSocial"),
    txtCampo: document.getElementById("txtCampo"),
    bttnAgregarCampoModal: document.getElementById("bttnAgregarCampoModal"),
    bttnAgregarCampo: document.getElementById("bttnAgregarCampo"),
    bttnBorrarCampoModal: document.getElementById("bttnBorrarCampoModal"),
    bttnBorrarCampo: document.getElementById("bttnBorrarCampo"),
    bttnEditar: document.getElementById("bttnEditar"),
    bttnGuardar: document.getElementById("bttnGuardar"),
    bttnCerrar: document.getElementById("bttnCerrar"),
    plantillaCampo: document.getElementById("plantillaCampo"),
    divAgregarCampo: document.getElementById("divAgregarCampo"),

    // Declaracion de funciones o metodos
    Init: function() {
        debugger;
        this.ConfigurarEventos();
    },

    ConfigurarEventos: function() {
        debugger;
        this.bttnAgregarCampo.addEventListener("click", this.AgregarCampo);
        this.bttnEditar.addEventListener("click", this.EditarCampos);
        this.bttnEditar.addEventListener("click", this.BorrarCampo);    
        this.bttnGuardar.addEventListener("click", this.GuardarCampo);    
    },

    AgregarCampo: function() {  
        try {
            debugger;

            // Recupera plantilla en texto
            let plantillaCampo = perfil.plantillaCampo.innerHTML;
            plantillaCampo = plantillaCampo.replace(/{id_campo}/g, "nuevoCampo1");
            plantillaCampo = plantillaCampo.replace(/{descripcion_campo}/g, perfil.txtCampo.value);

            // Crea un html en base a la plantilla
            let campo =  perfil.CreateHtml(plantillaCampo);

            // Obtiene el formulario y agrega el nuevo html (campo)
            const form = document.getElementById("formCV");
            form.insertBefore(campo, divAgregarCampo);

            // Limpiar el nombre del campo
            perfil.txtCampo.value = "";

            // Cerrar el modal
            perfil.bttnCerrar.click();

        } catch (error) {
            Swal.fire({
                icon: 'error',
                title: 'Error...',
                text: 'Fallo al momento de agregar un campo, favor de contactar al administrador'
              });
        }
    },
    

    EditarCampos: function() {
        try {
            debugger;
            const inputs = document.querySelectorAll("#formCV .form-control, #bttnAgregarCampoModal, #bttnBorrarCampoModal, #bttnGuardar");
            for (let input of inputs) {
                input.removeAttribute("disabled");
            }

            bttnEditar.setAttribute("disabled", "");

        } catch (error) {
            Swal.fire({
                icon: 'error',
                title: 'Error...',
                text: 'Fallo al habilitar los campos para Editar, favor de contactar al administrador'
              });
        }
    },

    GuardarCampo: function() {

        try {

            debugger;

            // Deshabilita los inputs y botones
            const inputs = document.querySelectorAll("#formCV .form-control, #bttnAgregarCampoModal, #bttnGuardar");
            for (let input of inputs) {
                input.setAttribute("disabled", "");
            }

            // Habilita el boton de Editar
            bttnEditar.removeAttribute("disabled");

            Swal.fire('Los datos se ha guardado correctamente', '', 'success');

        } catch (error) {
           Swal.fire({
            icon: 'error',
            title: 'Error...',
            text: 'Fallo al momento de guardar los datos, favor de contactar al administrador'
          });
        }
    },

    CreateHtml: function(html) {
        debugger;
        let template = document.createElement("template");
        template.innerHTML = html.trim();
        return template.content.firstChild;
    }

}