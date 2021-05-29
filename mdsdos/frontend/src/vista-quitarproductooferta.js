import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaQuitarproductooferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-l); justify-content: center;">
 <vaadin-vertical-layout theme="spacing" style="width: 40%; align-self: center; padding: var(--lumo-space-m);background-color:#6d7c8e47;border-radius:25px">
  <label style="font-weight: bold; align-self: center; margin: var(--lumo-space-s);">Quitar producto oferta </label>
  <label style="align-self: center; font-size: 13px; flex-grow: 0;" id="idProductoLbl">ID: 1234567890 </label>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; height: 5%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="border:solid; border-width:1px; align-self: center;">
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; width: 100%; height: 100%; justify-content: center; ">
    <vaadin-text-field label="Precio original" value="1000" theme="align-right" has-value id="precioOriginalInput">
     <div slot="suffix">
       � 
     </div>
    </vaadin-text-field>
    <vaadin-text-field label="Precio oferta" value="1000" theme="align-right" has-value id="precioFinalInput">
     <div slot="suffix">
       ? 
     </div>
    </vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: center;">
    <label style="padding: var(--lumo-space-s);">Fecha fin</label>
    <vaadin-text-field id="fechaFinLbl" style="align-self: center;"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout style="width: 100%; height: 20%; justify-content: center;">
   <vaadin-button style="flex-grow: 0; flex-shrink: 1; margin: var(--lumo-space-s);" id="aceptarBtn">
     Aceptar 
   </vaadin-button>
   <vaadin-button id="cancelarBtn" style="margin: var(--lumo-space-s);">
     Cancelar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-quitarproductooferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaQuitarproductooferta.is, VistaQuitarproductooferta);
