import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaProductopedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; border:solid; border-width:1px; padding: var(--lumo-space-xl); justify-content: flex-start;" theme="spacing">
 <vaadin-horizontal-layout style="width: 25%; margin: var(--lumo-space-m); justify-content: center;">
  <vaadin-vertical-layout style="width: 15%;">
   <img id="imgProducto" style="align-self: center; flex-grow: 0; flex-shrink: 1; margin: var(--lumo-space-l); width: 100%;" src="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs">
  </vaadin-vertical-layout>
  <img id="imgProducto" style="align-self: center; flex-grow: 0; flex-shrink: 1; margin: var(--lumo-space-m);" src="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs">
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="height: 100%; align-self: center; justify-content: center; align-items: flex-start; margin-right: var(--lumo-space-m);">
  <label id="nombreProductoLbl" style="width: 100%; align-self: center;font-weight:bold">producto</label>
  <label id="descripProducLbl" style="width: 100%; align-self: center;">descripcion </label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center;">
  <label id="precioUnidadLbl">precio</label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 25%; height: 100%; justify-content: center; align-self: center;">
  <vaadin-button id="com,entarBtn" style="align-self: flex-end;">
    Comentar 
  </vaadin-button>
  <vaadin-button id="deleteBtn" style="align-self: flex-end;">
    Eliminar 
  </vaadin-button>
  <vaadin-combo-box id="vaadinComboBox" style="align-self: flex-end;text-aling:rigth">
    1 
  </vaadin-combo-box>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="justify-content: center;">
  <label id="precioEurosLbl" style="width: 100%;"></label>
  <label id="unidadesLbl" style="width: 100%;">cantidad </label>
  <label id="valoracionLbl" style="width: 100%;"></label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productopedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductopedido.is, VistaProductopedido);
