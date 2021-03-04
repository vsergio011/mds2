import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCambiocontrasena extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 40%; align-self: center; justify-content: center; padding: var(--lumo-space-l);">
  <label style="font-weight: bold; align-self: center; margin: var(--lumo-space-s);">Cambio de contraseña</label>
  <vaadin-password-field label="Nueva contraseña" placeholder="Enter password" value="secret1" style="align-self: center;" has-value></vaadin-password-field>
  <vaadin-password-field label="Repetir contraseña" placeholder="Enter password" value="secret1" style="align-self: center;" has-value></vaadin-password-field>
  <vaadin-horizontal-layout theme="" style="width: 80%; align-self: center; justify-content: space-between;">
   <vaadin-button>
    Continuar 
   </vaadin-button>
   <vaadin-button>
    Cancelar
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cambiocontrasena';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCambiocontrasena.is, VistaCambiocontrasena);
