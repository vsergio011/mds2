import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaCambiodatoscompra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout theme="spacing" style="width: 50%; height: 40%; align-self: center; padding: var(--lumo-space-l); justify-content: center; align-items: center;">
  <label style="font-weight: bold; align-self: center; margin: var(--lumo-space-s);">Cambios datos de compra</label>
  <vaadin-vertical-layout style="justify-content: center; align-self: center; align-items: center;">
   <vaadin-text-field label="Direccion completa" id="direccionInput" style="width: 100%;"></vaadin-text-field>
   <vaadin-text-field label="Datos de pago" id="datosPagoInput" style="width: 100%;"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="justify-content: space-between;">
   <vaadin-button id="aceptarBtn">
     Aceptar 
   </vaadin-button>
   <vaadin-button id="cancelarBtn">
     Cancelar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cambiodatoscompra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCambiodatoscompra.is, VistaCambiodatoscompra);
