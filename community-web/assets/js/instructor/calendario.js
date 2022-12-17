window.onload = function () {
    debugger;
    calendario.Init();
}

let calendario = {

    // Declaracion de controles
    listTalleres: document.getElementById("listTalleres"),
    contentCalendario: document.getElementById("contentCalendario"),
    contentTodosTalleres: document.getElementById("contentTodosTalleres"),

    // Declaracion de funciones o metodos
    Init: function() {
        debugger;
        this.ConfigurarEventos();
    },

    ConfigurarEventos: function() {
        debugger;
        this.listTalleres.querySelectorAll(".dropdown-item").forEach(function(taller) {
            taller.addEventListener("click", calendario.SeleccioneunTaller);
        });
    },
    
    SeleccioneunTaller: function() {

        debugger;
        const text = this.innerHTML;
        if(text == "Todos los Talleres") {
            // Mostrar la tabla
            calendario.contentCalendario.classList.add("visually-hidden");
            calendario.contentTodosTalleres.classList.remove("visually-hidden");
        }
        else {
            // Mostrar el calendario del taller seleccionado
            calendario.contentCalendario.classList.remove("visually-hidden");
            calendario.contentTodosTalleres.classList.add("visually-hidden");
            
        } 
        

        // try {
        //     debugger;
        //     const inputs = document.querySelectorAll(" #bttnTodoslosTalleresModal, #bttnScrumMasterModa,#bttnProductOwnerModal,#bttnKanbanModal,#bttnDesingThingModal");
        //     for (let input of inputs) {
        //         input.removeAttribute("disabled");
        //     }

        //     bttnEditar.setAttribute("disabled", "");

        // } catch (error) {
        //     Swal.fire({
        //         icon: 'error',
        //         title: 'Error...',
        //         text: 'Fallo al habilitar los campos para Editar, favor de contactar al administrador'
        //       });
        // }

    }

}