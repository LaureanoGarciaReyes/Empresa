function activar() {

  document.getElementById("txtIDTaller").disabled = false;
  document.getElementById("txtNomTaller").disabled = false;
  document.getElementById("txtHoras").disabled = false;
  document.getElementById("Certificacion1").disabled = false;
  document.getElementById("Certificacion2").disabled = false;
  document.getElementById("Certificacion3").disabled = false;
  document.getElementById("Certificacion4").disabled = false
  document.getElementById("Certificacion5").disabled = false;
  
  document.getElementById("añadir").disabled = false;

}

function Guardar() {
  Swal.fire({
    title: '¿Desea guardar los cambios?',
    showDenyButton: true,
    confirmButtonText: 'Guardar',
    confirmButtonColor: '#19e619',
    denyButtonText: 'Cancelar',
    icon: 'question',
  }).then((result) => {
    /* Read more about isConfirmed, isDenied below */
    if (result.isConfirmed) {
      Swal.fire('¡Guardado!', '', 'success')
      document.getElementById("txtIDTaller").disabled = true;
      document.getElementById("txtNomTaller").disabled = true;
      document.getElementById("txtHoras").disabled = true;
      document.getElementById("Certificacion1").disabled = true;
      document.getElementById("Certificacion2").disabled = true;
      document.getElementById("Certificacion3").disabled = true;
      document.getElementById("Certificacion4").disabled = true;
      document.getElementById("Certificacion5").disabled = true;
      
      document.getElementById("añadir").disabled = true;
      document.getElementById("bttnEliminar").style.display = 'none';
    } else if (result.isDenied) {
      Swal.fire('¡Cambio no guardado! ', '', 'error')
    }
  })

}
function Aceptar() {

  document.getElementById("txtIDTaller").disabled = false;
  document.getElementById("txtNomTaller").disabled = false;
  document.getElementById("txtHoras").disabled = false;
  document.getElementById("Certificacion1").disabled = false;
  document.getElementById("Certificacion2").disabled = false;
  document.getElementById("Certificacion3").disabled = false;
  document.getElementById("Certificacion4").disabled = false;
  document.getElementById("Certificacion5").disabled = false;

  document.getElementById("añadir").disabled = false;
  document.getElementById("bttnEliminar").style.display = '';

}
function importar() {
  alert('Falta agregar opción de busqueda en el disco local');

}
function Eliminar() {

  Swal.fire({
    title: 'Esta seguro de eliminar el registro',
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
        'Eliminado',
        'El registro ha sido eliminado',
        'success'
      )
      document.getElementById("txtIDTaller").disabled = true;
      document.getElementById("txtNomTaller").disabled = true;
      document.getElementById("txtHoras").disabled = true;
      document.getElementById("Certificacion1").disabled = true;
      document.getElementById("Certificacion2").disabled = true;
      document.getElementById("Certificacion3").disabled = true;
      document.getElementById("Certificacion4").disabled = true;
      document.getElementById("Certificacion5").disabled = true;
    
      document.getElementById("añadir").disabled = true;
      document.getElementById("bttnEliminar").style.display = 'none';
    }
  })

}

document.querySelector('#pdffFile').addEventListener('change', () => {

  let pdffFile = document.querySelector('#pdffFile').files[0];
  let pdffFileURL = URL.createObjectURL(pdffFile) + "#toolbar=0";

  document.querySelector('#vistaPrevia').setAttribute('src', pdffFileURL);
})
