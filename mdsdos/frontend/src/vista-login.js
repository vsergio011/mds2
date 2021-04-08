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
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout style="width: 100%; height: 100%; align-self: center; flex-direction: column; justify-content: center; align-items: center;" id="vaadinVerticalLayout1">
  <vaadin-text-field label="Nombre de usuario" placeholder="Placeholder" id="usernameLbl"></vaadin-text-field>
  <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" style="align-self: center;" has-value id="passwordLbl"></vaadin-password-field>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button id="registerBtn">
     Registrarse 
   </vaadin-button>
   <vaadin-button id="loginBtn">
     Entrar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-button id="resetPasswordBtn">
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
