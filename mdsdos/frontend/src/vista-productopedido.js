import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; border:solid;" theme="spacing">
 <img id="imgProducto" style="align-self: center; flex-grow: 0; flex-shrink: 1; width: 25%; margin: var(--lumo-space-l);" src="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs">
 <vaadin-vertical-layout style="width: 25%; height: 100%; align-self: center; justify-content: center;">
  <label id="nombreProductoLbl" style="width: 100%;">Nombre del producto </label>
  <label id="descripProducLbl" style="width: 100%;">Descripción breve del producto </label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 25%; height: 100%; justify-content: center;">
  <label id="precioUnidadLbl" style="width: 100%;">Precio por unidad: total</label>
  <label id="unidadesLbl" style="width: 100%;">Unidades: 2 </label>
  <vaadin-button id="com,entarBtn" style="width: 100%;">
    Comentar 
  </vaadin-button>
  <vaadin-button id="deleteBtn" style="width: 100%;">
    Eliminar 
  </vaadin-button>
  <vaadin-combo-box id="vaadinComboBox" style="width: 100%;">
   1
  </vaadin-combo-box>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 25%; justify-content: center;">
  <label id="precioEurosLbl" style="width: 100%;">Precio en euros </label>
  <label id="valoracionLbl" style="width: 100%;">Valorado 5/5 </label>
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
