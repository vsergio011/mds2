import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaAgregaroferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 40%; align-items: center; align-self: center; margin-top: 10%; border:solid; padding-top: var(--lumo-space-xl); padding: var(--lumo-space-xl); padding-left: 10%;">
  <vaadin-vertical-layout theme="spacing" style="align-self: flex-start; align-items: flex-start;">
   <label style="font-weight: bold;">Añadir producto a oferta</label>
   <label>ID:1233423213</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; align-self: flex-start;">
   <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: space-between;">
    <label style="align-self: center;">Fecha de fin: </label>
    <vaadin-date-picker style="align-self: center; flex-grow: 1; flex-shrink: 0;"></vaadin-date-picker>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; width: 100%; justify-content: space-between;">
    <label style="flex-grow: 1;">Precio orginal</label>
    <input type="text">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="justify-content: space-between;">
    <label>Precio de oferta</label>
    <input type="text">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; height: 100%; justify-content: space-between; align-items: center;">
    <vaadin-button>
     Cancelar
    </vaadin-button>
    <vaadin-button>
     Aceptar
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-agregaroferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregaroferta.is, VistaAgregaroferta);
