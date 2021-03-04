import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaLogin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 40%; align-self: center; justify-content: center;">
  <label style="font-weight: bold; align-self: center; margin: var(--lumo-space-s);">Inicio de sesion</label>
  <vaadin-text-field label="Nombre de usuario" style="align-self: center;"></vaadin-text-field>
  <vaadin-password-field label="Password" placeholder="Enter password" value="secret1" style="align-self: center;" has-value></vaadin-password-field>
  <vaadin-horizontal-layout style="width: 90%; align-self: center; justify-content: space-around;">
   <vaadin-button>
    ACeptar
   </vaadin-button>
   <vaadin-button>
    Cancelar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-button style="align-self: center; width: 60%;">
   Recuperar contraseña 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-login';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaLogin.is, VistaLogin);
