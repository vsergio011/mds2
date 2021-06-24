import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPerfil extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; padding: var(--lumo-space-xl);">
 <vaadin-vertical-layout theme="spacing" style="width: 60%; align-items: center; background-color :#374453; ">
  <img src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg" style="align-self: center; width: 40%; border-radius: 40px 40px 40px 10px; margin: var(--lumo-space-l);" id="img">
  <vaadin-vertical-layout theme="spacing-xs" style="align-items: center; flex-grow: 0;">
   <vaadin-button style="width: 100%;" id="ModificarDatosBtn">
     Modificar datos 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="comprasRealizadasBtn">
     Compras realizadas 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="contactoBtn">
     Contacto 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="borrarCuentaBtn">
     Borrar cuenta 
   </vaadin-button>
   <vaadin-button style="width: 100%;" id="desconectarBtn">
     Desconectar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing-l" style="width: 100%;" id="perfilLayout">
  <label style="font-size: 30px; font-weight: bold; padding: var(--lumo-space-m);" id="nombreApellidosLbl"></label>
  <label id="emailLbl" style="padding: var(--lumo-space-m);"></label>
  <label id="direccionLbl" style="padding: var(--lumo-space-l);"></label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-perfil';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPerfil.is, VistaPerfil);
