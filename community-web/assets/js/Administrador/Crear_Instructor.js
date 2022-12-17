
function Nuevoinstructor(){

    document.getElementById("txtNombre").disabled = false;
    document.getElementById("txtPassword").disabled= false;
    document.getElementById("txtCorreo").disabled = false;
    document.getElementById("btnGuardar").disabled = false;

}
function Guardar(){
   
    Swal.fire({
        title: '¿Desea guardar los cambios?',
        showDenyButton: true,
        confirmButtonText: 'Guardar',
        confirmButtonColor: '#19e619',
        denyButtonText: 'Cancelar',
        icon:'question',
      }).then((result) => {
        /* Read more about isConfirmed, isDenied below */
        if (result.isConfirmed) {
         Swal.fire('¡Guardado!', '', 'success')
         document.getElementById("txtNombre").disabled = true;
         document.getElementById("txtPassword").disabled= true;
         document.getElementById("txtCorreo").disabled = true;
         document.getElementById("btnGuardar").disabled = true;

        } else if (result.isDenied) {
          Swal.fire('¡Cambio no guardado! ', '', 'error')
        }
      })
    
}
function AceptarMod(){
    document.getElementById("txtNombre").disabled = false;
    document.getElementById("txtPassword").disabled= false;
    document.getElementById("txtCorreo").disabled = false;
    document.getElementById("btnGuardar").disabled = false;
    document.getElementById('btnBorrar').style.display= '';

}
function Eliminar(){
     
    Swal.fire({
        title: '¿Esta seguro de eliminar el registro?',
        text: "¡No podrá revertir esta acción!",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#19e619',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Confirmar',
        cancelButtonText: 'Cancelar'
      }).then((result) => {
        if (result.isConfirmed) {
          Swal.fire(
            '¡Eliminado!',
            'El registro ha sido eliminado',
            'success'
            
          )
        }
      })
}