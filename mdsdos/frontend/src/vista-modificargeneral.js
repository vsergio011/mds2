import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaModificargeneral extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width:100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="align-items: center; background-color :#374453; width: 30%;">
  <vaadin-vertical-layout theme="spacing">
   <img src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg" style="align-self: center; width: 40%; margin: var(--lumo-space-xl);border-radius: 40px 40px 40px 10px;" id="img">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="" style="align-items: center; justify-content: center;">
   <vaadin-button style="width: 100%;" id="cambiarPasswordBtn">
     Cambiar contraseña 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="borrarCuentaBtn">
     Borrar cuenta 
   </vaadin-button>
   <vaadin-button id="aceptarCambiosBtn" style="width: 100%;">
     Aceptar Cambios 
   </vaadin-button>
   <vaadin-vertical-layout style="margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout style="background-color:white; width: 100%; align-self: center;">
     <vaadin-upload id="imgUpload"></vaadin-upload>
    </vaadin-horizontal-layout>
    <vaadin-button id="addImgBtn" style="width: 25%; align-self: center;background-color:#778899;border-radius:50px">
      + 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl); border-left: solid; border-width: 0.1px; width: 100%;background-color:#f5f5f5
" id="containerLayout">
  <vaadin-text-field label="Nombre de usuario" placeholder="Placeholder" id="lbNombreUsuario" style="width: 90%;"></vaadin-text-field>
  <vaadin-text-field label="Nombre" placeholder="Placeholder" style="width: 90%;" id="lbNombre"></vaadin-text-field>
  <vaadin-text-field label="Apellidos" placeholder="Placeholder" style="width: 90%;" id="lbApellidos"></vaadin-text-field>
  <vaadin-text-field label="email" placeholder="Placeholder" style="width: 90%;" id="lbEmail"></vaadin-text-field>
  <vaadin-text-field label="Direccion completa" placeholder="Placeholder" style="width: 90%;" id="lbDireccion"></vaadin-text-field>
  <vaadin-text-field label="Datos de pago" placeholder="Placeholder" style="width: 90%;" id="lbDatosDePago"></vaadin-text-field>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-modificargeneral';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaModificargeneral.is, VistaModificargeneral);