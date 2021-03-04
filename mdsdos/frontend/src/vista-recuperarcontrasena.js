import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaRecuperarcontrasena extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 40%; align-self: center; justify-content: center; padding: var(--lumo-space-xl);">
  <label style="font-weight: bold; align-self: flex-start;">Recuperacion de contraseña </label>
  <label style="align-self: flex-start; font-size: 13px; flex-grow: 0; width: 85%;">Introduzca su direccion de correo electronico para proceder a la recuperacion de su contraseña </label>
  <vaadin-horizontal-layout theme="" style="width: 100%;">
   <label style="width: 60%; align-self: center;">Direccion de correo </label>
   <vaadin-button>
    Continuar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-recuperarcontrasena';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRecuperarcontrasena.is, VistaRecuperarcontrasena);
